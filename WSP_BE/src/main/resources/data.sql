INSERT INTO user (id, email, password) VALUES (1, 'test@naver.com', '1234')
INSERT INTO user_info (id, u_id, total_points, rank, introduction) VALUES(1, 100, 1, 'hi im first solver')
INSERT INTO article(id, title, content, w_date, u_date, u_id) VALUES(1, 'hi', 'i have a question', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1)
INSERT INTO comment(id, a_id, content, w_date, u_date) VALUES(1, 1, 'wow amazing', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP)
INSERT INTO poblem(id, points) VALUES(1, 100)
INSERT INTO solved_problem(s_date, u_id, p_id) VALUES(CURRENT_TIMESTAMP, 1, 1)