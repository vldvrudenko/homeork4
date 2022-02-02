package com.company;

import java.util.Arrays;

    public class Main {
        public static void main(String[] args) {

            String[][] fatherSchedule = {
                    {"MONDAY", "University"},
                    {"TUESDAY", "English courses , university"},
                    {"WEDNESDAY", "Courses , university"},
                    {"THURSDAY", "Walking in the park"},
                    {"FRIDAY", "Practice skills"},
                    {"SATURDAY", "Courses , university"},
                    {"SUNDAY", "Courses"}
            };
            String[][] motherSchedule = {
                    {"MONDAY", "University , waliking"},
                    {"TUESDAY", "Meeting with friends"},
                    {"WEDNESDAY", "Courses , University"},
                    {"THURSDAY", "Free day"},
                    {"FRIDAY", "Courses"},
                    {"SATURDAY", "Free day"},
                    {"SUNDAY", "Ending english courses"}
            };
            String[][] childrenSchedule = {
                    {"MONDAY", "School"},
                    {"TUESDAY", "School , courses"},
                    {"WEDNESDAY", "School , meeting with friends"},
                    {"THURSDAY", "School , english courses"},
                    {"FRIDAY", "School, free time"},
                    {"SATURDAY", "Dancing lessons"},
                    {"SUNDAY", "Free day"}
            };

            String[] petHabits = {"Eating", "Sleaping"};

            Human fatherVlad = new Human("Vlad", "Vladislov", 39, 85, fatherSchedule);
            Human motherOksana= new Human("Oksana", "Vladislov", 25, 89, motherSchedule);
            Human childrenAntonio = new Human("Antonio", "Vladislov", 12, 56, childrenSchedule);
            Pet catVagon = new Pet("Cat", "Vagon", 1, 45, petHabits);
            Family familyVladislov  = new Family(motherOksana, fatherVlad, new Human[]{childrenAntonio}, catVagon);


            System.out.println("It is " + familyVladislov.getFather().getSurname() + " family: ");
            System.out.println(familyVladislov.getFather().getSurname() + " family have " + familyVladislov.countFamily(familyVladislov) + " members");
            System.out.println();
            System.out.println("Family`s pet: " + familyVladislov.getPet());
            System.out.println();
            System.out.println("Family`s children: " + Arrays.toString(familyVladislov.getChildren()));
            System.out.println();
            System.out.println("Family`s mother: " + familyVladislov.getMother());
            System.out.println();
            System.out.println("Family`s father: " + familyVladislov.getFather());
            System.out.println();

            familyVladislov.deleteChild(1);
            System.out.println("The number of  " + familyVladislov.getFather().getSurname() +  " family: " + familyVladislov.countFamily(familyVladislov) + " Son deleted");
            System.out.println();

            familyVladislov.addChild(childrenAntonio);
            System.out.println("The number of  " + familyVladislov.getFather().getSurname() +  " family: " + familyVladislov.countFamily(familyVladislov) + " Son added");
            System.out.println();


            familyVladislov.describePet();
            familyVladislov.getPet().eat();
            familyVladislov.getPet().foul();
            familyVladislov.getPet().respond();
            System.out.println();

            familyVladislov.getFather().getSchedule();
            System.out.println();

            familyVladislov.getMother().getSchedule();
            System.out.println();
        }
    }




