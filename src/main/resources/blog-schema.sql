DROP TABLE IF EXISTS Post;

CREATE TABLE Post (
      id varchar(255) NOT NULL,
      title varchar(255) NOT NULL,
      slug varchar(255) NOT NULL,
      date date NOT NULL,
      tags varchar(255),
      PRIMARY KEY (id)
);

INSERT INTO Post
(id, title, slug, date,  tags)
VALUES (1,'Hello, World!','hello-world',CURRENT_DATE, 'Spring Boot, Java');