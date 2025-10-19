public class Employee {
        private final int id;
        private final String name;
        private final Age age;

        Employee(int id, String name, Age age) {
            this.id = id;
            this.name = name;
            this.age = this.clonedAge(age);
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public Age getAge() {
            return this.clonedAge(this.age);
        }

        public Age clonedAge(Age age) {
            Age clonedAge = new Age();
            clonedAge.setMonth(age.getMonth());
            return clonedAge;
        }
}
