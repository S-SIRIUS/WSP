use wsp;
INSERT INTO user_info (id, total_points, ranking, introduction) VALUES(1, 100, 1, 'hi im first solver');
INSERT INTO user (id, email, password, info_id) VALUES (1, 'test@naver.com', '1234', 1);
INSERT INTO article(id, title, content, w_date, u_date, u_id) VALUES(1, 'hi', 'i have a question', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP,1);
INSERT INTO comment(id, a_id, content, w_date, u_date) VALUES(1, 1, 'wow amazing', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO problem(id, points) VALUES(1, 100);
INSERT INTO solved_problem(id, u_id, p_id, s_date) VALUES(1, 1, 1, CURRENT_TIMESTAMP);

select * from solved_problem;