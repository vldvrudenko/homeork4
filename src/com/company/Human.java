package com.company;
import java.util.Arrays;

    public class Human {
        private String name;
        private String surname;
        private int year;
        private int IQ;
        private Family family;
        private String[][] schedule;

        public Human(String name, String surname, int year) {
            this.name = name;
            this.surname = surname;
            this.year = year;
        }

        public Human(String name, String surname, int year, int IQ, String[][] schedule) {
            this.name = name;
            this.surname = surname;
            this.year = year;
            this.IQ = IQ;
            this.schedule = schedule;
        }

        public Human() {}

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getSurname() {
            return surname;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        public void setIQ(int IQ) {
            this.IQ = IQ;
        }

        public int getIQ() {
            return IQ;
        }

        public void setFamily(Family family) {
            this.family = family;
        }

        public Family getFamily() {
            return family;
        }

        public String[][] getSchedule() {
            return schedule;
        }

        public void setSchedule(String[][] schedule) {
            this.schedule = schedule;
        }

        public void greetPet() {
            System.out.println("Hi, " + family.getPet().getNickname());
        }

        @Override
        public String toString() {
            return "Human{name=" + name + ", surname="
                    + surname + ", year=" + year
                    + ", iq=" + IQ + ", schedule" + Arrays.deepToString(schedule) + "}";
        }

        @Override
        public int hashCode() {
            int schedule = Arrays.deepHashCode(this.schedule);
            int name = this.name.hashCode();
            return schedule + name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Human human = (Human) o;
            return name.equals(human.name);
        }

}
