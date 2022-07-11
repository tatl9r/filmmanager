 package ru.netology.domain;
    public class Film {

        private String name;
        private String genre;
        private int id;

        public Film(String name, String genre, int id) {
            this.name = name;
            this.genre = genre;
            this.id = id;
        }

        public Film() {
        }


        public int getId() {
            return id;
        }
        public String getGenre() {
            return genre;
        }
        public String getName() {
            return name;
        }

        public void setId(int id) {
            this.id = id;
        }
        public void setGenre(String genre) {
            this.genre = genre;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
