CREATE TABLE IF NOT EXISTS sku_info
(
    id             BIGSERIAL NOT NULL PRIMARY KEY,
    sku_id         BIGINT    NOT NULL
);

CREATE TABLE IF NOT EXISTS sku_property
(
    id             BIGSERIAL NOT NULL PRIMARY KEY,
    sku_info_id    BIGINT
        CONSTRAINT sku_info_fkey REFERENCES sku_info,
    datamatrix     VARCHAR(255),
    serial_number  VARCHAR(255)
);