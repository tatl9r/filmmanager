package ru.netology.domain;
public class FilmManager {
        private Film[] films = new Film[0];
        private int limit;

        public FilmManager(int limit) {
            this.limit = limit;
        }

        public FilmManager() {
            this.limit = 10;
        }
        public void add(Film film) {
            int length = films.length + 1;
            Film[] films2 = new Film[length];
            System.arraycopy(films, 0, films2, 0, films.length);
            int newFilm = films2.length - 1;
            films2[newFilm] = film;
            films = films2;
        }

        public Film[] findAll() {
            return films;
        }

        public Film[] findLast() {
            Film[] films = findAll();
            int resultLength;
            boolean isLimited = this.limit < findAll().length;
            resultLength = isLimited ? this.limit : findAll().length;
            Film[] result = new Film[resultLength];
            for (int i = 0; i < result.length; i++) {
                int index = films.length - i - 1;
                result[i] = films[index];
            }
            return result;
        }
    }
