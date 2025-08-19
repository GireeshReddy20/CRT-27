public class sample {
        int studentId;
        String studentName;
        int studentAge;
        String studentBranch;
        long studentYear;
        int teacherId;
        String teacherName;
        String subject;
        void setStudentDetails(int studentId, String studentName, int studentAge, String studentBranch, long studentYear) {
            this.studentId = studentId;
            this.studentName =studentName;
            this.studentAge = studentAge;
            this.studentBranch = studentBranch;
            this.studentYear = studentYear;
        }
        void setTeacherDetails(int teacherId, String teacherName, String subject) {
            this.teacherId = teacherId;
            this.teacherName = teacherName;
            this.subject = subject;
        }
        void getStudentDetails() {
            System.out.println("Student Details:");
            System.out.println("Student ID: " +studentId);
            System.out.println("Student Name: " +studentName);
            System.out.println("Student Age: " +studentAge);
            System.out.println("Student Branch: " +studentBranch);
            System.out.println("Student Year: " +studentYear);
        }
        void getTeacherDetails() {
            System.out.println("Teacher Details:");
            System.out.println("Teacher ID: " + teacherId);
            System.out.println("Teacher Name: " + teacherName);
            System.out.println("Subject: " + subject);
        }
        public static void main(String[] args) {
            sample s = new sample();
            s.setStudentDetails(237013269, "Ram", 20, "AI&DS", 2027);
            s.setTeacherDetails(23756, "Dr.Ashok", "Artificial Intelligence");
            s.getStudentDetails();
            System.out.println();
            s.getTeacherDetails();
        }
    }


