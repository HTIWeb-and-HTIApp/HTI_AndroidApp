package com.example.navigation.buttomnav

import com.example.navigation.R

sealed class BottomNavItem(
    var title: String,
    var icon: Int,
    var route: String
) {
    data object Home : BottomNavItem("Home", R.drawable.home,"HomeScreen")
    data object MyCourses: BottomNavItem("My Courses", R.drawable.courses,"MyCoursesScreen")
    data object Services: BottomNavItem("Services",R.drawable.services,"ServicesScreen")
}