package com.company;
import java.util.Arrays;
import java.util.Objects;

    public class Family {
        private Human mother;
        private Human father;
        private Human[] children;
        private Pet pet;


        public Family(Human mother, Human father) {
            this.mother = mother;
            this.mother.setFamily(this);
            this.father = father;
            this.father.setFamily(this);
            this.children = new Human[0];
        }

        public Family(Human mother, Human father, Human[] children, Pet pet) {
            this.mother = mother;
            this.mother.setFamily(this);
            this.father = father;
            this.father.setFamily(this);
            this.children = children;
            this.pet = pet;
        }

        public void setMother(Human mother) {
            this.mother = mother;
        }

        public Human getMother() {
            return mother;
        }

        public void setFather(Human father) {
            this.father = father;
        }

        public Human getFather() {
            return father;
        }

        public void setChildren(Human[] children) {
            this.children = children;
        }

        public Human[] getChildren() {
            return children;
        }

        public void setPet(Pet pet) {
            this.pet = pet;
        }

        public Pet getPet() {
            return pet;
        }

        public void addChild(Human child) {
            this.children = Arrays.copyOf(children, children.length + 1);
            children[children.length - 1] = child;
            child.setFamily(this);
        }

        public boolean deleteChild(int childIndex) {
            if (childIndex >= children.length || childIndex < 0) {
                return false;
            }
            if (children.length - 1 - childIndex >= 0)
                System.arraycopy(children, childIndex + 1, children, childIndex, children.length - 1 - childIndex);
            Human[] newChildren = Arrays.copyOf(children, children.length - 1);
            setChildren(newChildren);
            return true;
        }

        public void describePet() {
            System.out.println("У нас есть "
                    + getPet().getSpecies()
                    + ", ему " + getPet().getAge()
                    + " годика " + (getPet().getTrickLevel() <= 50 ? "и он не очень хитрый" :
                    "и он очень хитрый"));
        }

        public int countFamily(Family family) {
            return family.getChildren().length + 2;
        }

        @Override
        public String toString() {
            return "Это семья " + father.getSurname() + "\nМама: " + mother.toString() + " " +
                    "\nПапа: "
                    + father.toString()
                    + " \nДети: "
                    + Arrays.toString(children)
                    + " \nДомашние питомцы: "
                    + pet.toString();
        }

        @Override
        public int hashCode() {
            return Objects.hash(mother, father);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (!(obj instanceof Family))
                return false;
            Family family = (Family) obj;
            return (mother.hashCode() == family.getMother().hashCode());
        }

}
