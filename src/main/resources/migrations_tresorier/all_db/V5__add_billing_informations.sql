ALTER TABLE person
ADD COLUMN billing_id VARCHAR(36) DEFAULT NULL UNIQUE;

ALTER TABLE person
ADD COLUMN billing_status BOOLEAN DEFAULT NULL;