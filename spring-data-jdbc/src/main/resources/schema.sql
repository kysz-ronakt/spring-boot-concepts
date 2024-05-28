-- CREATE TABLE ChessGame
-- (
--     id          BIGSERIAL PRIMARY KEY,
--     playerWhite VARCHAR(255) NOT NULL,
--     playerBlack VARCHAR(255) NOT NULL
-- );
--
-- CREATE TABLE ChessMove
-- (
--     id          BIGSERIAL PRIMARY KEY,
--     chessGameId BIGINT       NOT NULL,
--     move        VARCHAR(255) NOT NULL,
--     moveNumber  INT          NOT NULL,
--     CONSTRAINT fk_chessgame
--         FOREIGN KEY (chessGameId)
--             REFERENCES ChessGame (id)
-- );

create table Post(
    int id auto_increament primary key ,
    version int,
    title varchar not null ,
    content text not null ,
    published_on timestamp not null,
    updated_on timestamp not null
);

