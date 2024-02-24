package com.dev.avro.serialize;

import com.dev.avro.model.Department;
import com.dev.avro.model.Employee;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.dataformat.avro.AvroMapper;
import com.fasterxml.jackson.dataformat.avro.AvroSchema;
import com.fasterxml.jackson.dataformat.avro.jsr310.AvroJavaTimeModule;
import com.fasterxml.jackson.dataformat.avro.schema.AvroSchemaGenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DataSerialize {


    public static void createAvroSchema(Class<?> clazz, AvroMapper avroMapper) throws IOException {

        Employee employee = Employee.builder()
                .id(1l)
                .firstName("Ronak")
                .lastName("T")
                .department("IT")
                .build();


        AvroSchemaGenerator gen = new AvroSchemaGenerator();
        gen.enableLogicalTypes();
        avroMapper.acceptJsonFormatVisitor(clazz, gen);
        AvroSchema schemaWrapper = gen.getGeneratedSchema();

        org.apache.avro.Schema avroSchema = schemaWrapper.getAvroSchema();
        String avroSchemaInJSON = avroSchema.toString(true);

        //Write to File
        Path fileName = Path.of(clazz.getSimpleName() + ".avsc");
        Files.writeString(fileName, avroSchemaInJSON);
    }


    public static void generateAvroFile() throws IOException {
        AvroMapper avroMapper = AvroMapper.builder()
                .disable(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY)
                .addModule(new AvroJavaTimeModule())
                .build();

        createAvroSchema(Department.class, avroMapper);
        createAvroSchema(Employee.class, avroMapper);
    }


}
