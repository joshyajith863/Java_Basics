class Officer extends Employee{
        Employee emp = new Employee();
        Officer() {
            this.name = "Officer";
            this.age = 0;
            this.Ph_No = 0;
            this.Employee_Id = 0;
            this.address = "Officer";
        }
        void display() {
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Ph_No: " + this.Ph_No);
            System.out.println("Employee_Id: " + this.Employee_Id);
            System.out.println("Address: " + this.address);
        }

    }