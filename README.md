# nutrienti

The code in this repository only represents the beginning stages of the nutrienti android app, and is not represenative of where the project stands today.
Most of the features below are not included in the uploaded code, but are present and working in the app.

The nutrienti app is a complete fitness-inspired, macronutrient-focused food tracking android app.

# Features:
- Ability to sign up for and sign into a nutrienti account
- Add food to your diary by searching our database of user-submitted foods
- Single ring design that is used throughout the app to show macro and calorie effect based on your goals
- Rebalance food portions in diary to meet your goals with one button tap
- Add friends by searching for their username
- Track consistency with a "streak" that counts how many days in a row you've logged food
- See friend's rings for the day, and their streaks on the home screen, in realtime
- Log your weight so you can track your progress over time with an inutitive sparkline chart that supports scrubbing
- Flat and modern design

# Technical:
- Coded in Java using Android Studio
- Repository pattern (Single source of truth, decoupling)
- Observer pattern (LiveData)
- Firebase authentication
- Firebase realtime database (for social features)
- Firebase cloud firestore (for all other database needs)
- All visuals are vector-based
