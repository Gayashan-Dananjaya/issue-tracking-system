INSERT INTO developer (contact, email, name)
            VALUES  ('+94771234567', 'gayashan@gmail.com', 'Gayashan Gayashan'),
                    ('+94111234567', 'dananjaya@gmail.com', 'Dananjaya'),
                    ('+94770987654', 'balasuriya@gmail.com', 'Gayashan Dananjaya'),
                    ('+94718259212', 'gayashandananjaya@gmail.com', 'Gayashan Balasuriya');

INSERT INTO detail (about, contact1, contact2)
            VALUES ('This is the about section of the web application. Type the necessary details here to show in the footer section', '+94 77 1234567', '+94 11 1234567');

INSERT INTO faq (question, answer)
            VALUES ('The first question?', 'This is the answer to the first question'),
                   ('The second question?', 'This is the answer to the second question');

INSERT INTO project (client_name, duration, project_name, submission)
            VALUES ('Company 1', 6, 'POS', '2023-12-31'),
                   ('Company 2', 4, 'Employee Management System', '2023-10-31');

INSERT INTO issue (priority, publish_time, status, submitter_email, submitter_name, title, type, developer_id, project_id)
            VALUES (0, '2023-09-11 10:00:00', 0, 'gayashandananjaya@gmail.com', 'Dananjaya Balasuriya', 'Bug fix 1', 0, 1, 1),
                   (1, '2023-09-01 16:30:00', 1, 'dananjaya@gmail.com', 'Custom name 1', 'Improvement 1', 2, 2, 2),
                   (2, '2023-08-31 00:00:00', 3, 'gayashandananjaya@gmail.com', 'Balasuriya', 'Bug fix 2', 0, 4, 1);

INSERT INTO history (status, time, issue_id)
            VALUES (0, '2023-09-11 10:00:00', 1),
                   (0, '2023-08-16 09:00:00', 2),
                   (1, '2023-09-01 16:30:00', 2),
                   (0, '2023-07-25 13:30:00', 3),
                   (1, '2023-08-01 12:30:00', 3),
                   (2, '2023-08-20 10:00:00', 3),
                   (3, '2023-08-31 00:00:00', 3);
