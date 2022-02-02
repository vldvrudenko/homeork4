package com.company;

import java.util.Arrays;

    public class Pet {
        private String species;
        private String nickname;
        private int age;
        private int trickLevel;
        private String[] habits;

        public Pet(String species, String nickname) {
            this.species = species;
            this.nickname = nickname;
        }

        public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
            this.species = species;
            this.nickname = nickname;
            this.age = age;
            this.trickLevel = trickLevel;
            this.habits = habits;
        }

        public Pet() {}
        public void setSpecies(String species) {
            this.species = species;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setTrickLevel(int trickLevel) {
            this.trickLevel = trickLevel;
        }

        public void setHabits(String[] habits) {
            this.habits = habits;
        }

        public String getSpecies() {
            return species;
        }

        public String getNickname() {
            return nickname;
        }

        public int getAge() {
            return age;
        }

        public int getTrickLevel() {
            return trickLevel;
        }

        public String[] getHabits() {
            return habits;
        }

        public void eat() {
            System.out.println("Я кушаю!");
        }

        public void respond() {
            System.out.println("Привет, хозяин. Я - " + this.nickname + ". Я соскучился!");
        }

        public void foul() {
            System.out.println("Нужно хорошо замести следы...");
        }

        @Override
        public String toString() {
            return this.getSpecies() + "{nickname="
                    + this.getNickname() + ", age="
                    + this.getAge() + ", trickLevel="
                    + this.getTrickLevel() + ", habits="
                    + Arrays.toString(this.getHabits()) + "}";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pet pet = (Pet) o;
            return Arrays.equals(habits, pet.habits);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(habits);
        }
}
