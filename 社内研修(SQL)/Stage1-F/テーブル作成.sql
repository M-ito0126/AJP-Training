USE TASK_DB;
CREATE TABLE M_OFFICE (
    OFFICE_CD VARCHAR(4) NOT NULL,
    SALES_OFFICE_NM VARCHAR(30) NOT NULL,
    DELET_FLG VARCHAR(1) DEFAULT 0 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO M_OFFICE VALUES
	('1001', '大阪営業所', '0'),
    ('2001', '福岡営業所', '0'),
    ('3001', '広島営業所', '0'),
    ('4001', '京都営業所', '0'),
    ('5001', '和歌山営業所', '0'),
    ('6001', '静岡営業所', '0'),
    ('7001', '福井営業所', '0'),
    ('8001', '東京営業所', '0'),
    ('901', '沖縄支部', '0'),
    ('901', '沖縄支部', '1'),
    ('901', '沖縄支部', '1')
;