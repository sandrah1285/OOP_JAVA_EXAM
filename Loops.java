// While loop
int day = 1;
while (day <= 30) {
    logPM25(day, sensor.readPM25());
    day++;  // increments day and stops loop when day > 30
}

// For loop
// The for loop repeats the code block for a set number of times.
// Initialization, condition, and increment are all inside the parentheses.
for (int d = 1; d <= 30; d++) {
    logPM25(d, sensor.readPM25());
}
