const eventName = "Community Cleanup Day";
const eventDate = "2025-06-10";
let availableSeats = 30;

console.log(`Upcoming Event: ${eventName}`);
console.log(`Date: ${eventDate}`);
console.log(`Seats Available: ${availableSeats}`);

function registerUser() {
    if (availableSeats > 0) {
        availableSeats--;
        console.log(`Registration successful! Seats left: ${availableSeats}`);
    } else {
        console.log("Sorry, no more seats available.");
    }
}

// Simulate registrations
registerUser();
registerUser();
