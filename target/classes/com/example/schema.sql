CREATE TABLE events (
	event_id INTEGER PRIMARY KEY AUTOINCREMENT,
	event_date DATE NOT NULL,
	event_day TEXT NOT NULL,
	title TEXT NOT NULL,
	start_time TIME NOT NULL,
	end_time TIME NOT NULL
);
