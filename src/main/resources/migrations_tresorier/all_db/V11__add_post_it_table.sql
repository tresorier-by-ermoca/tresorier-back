CREATE TABLE post_it (
        budget_id VARCHAR(36) NOT NULL,
        month INT NOT NULL,
        text VARCHAR(255),
        FOREIGN KEY (budget_id) REFERENCES budget(id),
        CONSTRAINT double_key PRIMARY KEY (budget_id, month),
        CONSTRAINT no_negative_month_for_post_it CHECK ( month%100 > 0),
        CONSTRAINT no_invalid_month_for_post_it CHECK ( month%100 < 13)
);