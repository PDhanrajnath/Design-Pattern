package com.designpatter.behavioral.iterator.demo;

public class CourseList implements List<Course>
{
    private Course[] Courses;

    public CourseList(Course[] Courses)
    {
        this.Courses = Courses;
    }

    @Override
    public Iterator<Course> iterator() {
        return new CourseIterator(Courses);
    }
}