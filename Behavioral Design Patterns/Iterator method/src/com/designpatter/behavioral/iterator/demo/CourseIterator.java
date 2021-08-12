package com.designpatter.behavioral.iterator.demo;

public class CourseIterator implements Iterator<Course> {

    private Course[] Courses;
    private int position;

    public CourseIterator(Course[] Courses)
    {
        this.Courses = Courses;
        position = 0;
    }

    @Override
    public Course next() {
        return Courses[position++];
    }

    @Override
    public Course currentItem() {
        return Courses[position];
    }

    @Override
    public boolean hasNext() {
        if(position >= Courses.length)
            return false;
        return true;
    }
}