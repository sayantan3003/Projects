SELECT * FROM COURSE ;

INSERT INTO course(id, name, author)
VALUES
(1, 'Bengali', 'A. Bhattacharya'),
(2, 'English', 'Durga De'),
(3, 'Mathematics', 'Pallab Banerjee'),
(4, 'History', 'TSRC'),
(5, 'Geography', 'A. Mondal'),
(6, 'Physical Science', 'A. Das'),
(7, 'Life Science', 'Tuhin Rudra'),
(8, 'Physical Education', 'P. Saha'),
(9, 'Work Education', 'A. Adhikary');

DELETE FROM course WHERE id > 7;