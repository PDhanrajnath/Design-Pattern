package com.designpatter.behavioral.iterator.demo;

public class DemoMainClass
{
    public static void main(String[] args)
    {
        Course[] Courses = new Course[7];
        Courses[0] = new Course("Linux");
        Courses[1] = new Course("Computer Networks");
        Courses[2] = new Course("SOLID principles");
        Courses[3] = new Course("Java");
        Courses[4] = new Course("Spring");
        Courses[5] = new Course("HTML & CSS");
        Courses[6] = new Course("ReactJS!");

        List<Course> list = new CourseList(Courses);

        Iterator<Course> iteratorCourse = list.iterator();

        Course firstCourse = iteratorCourse.currentItem();
        System.out.println("First Course: "+firstCourse.getName());

        while(iteratorCourse.hasNext()) {
            Course currentCourse = iteratorCourse.next();
            System.out.println(currentCourse.getName());
        }
        try{
            firstCourse = iteratorCourse.currentItem();
//            firstCourse.getName();
        }
        catch(Exception e){
            System.out.println("Exception --> "+e);
        }
    }
}