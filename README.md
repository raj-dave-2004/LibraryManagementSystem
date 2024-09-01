"# Library Management System" 

## Overview
This is a simple Library Management System built in Java, following Test-Driven Development (TDD) principles. It allows users to perform basic operations such as adding books, borrowing books, returning books, and viewing available books.

## Features
- **Add Books:** Add new books to the library.
- **Borrow Books:** Borrow a book from the library if it's available.
- **Return Books:** Return a borrowed book and update its availability.
- **View Available Books:** View a list of all available books in the library.

## Setup and Installation

### Prerequisites
- Java Development Kit (JDK) 8 or later
- Git
- JUnit 5 for testing
- Extension packs
  
1. Initialize Git Repository
     First, create a new directory for your project and initialize a Git repository:

mkdir LibraryManagementSystem
cd LibraryManagementSystem
git init

2. Create Initial README
  Create a README.md file to describe your project:

echo "# Library Management System" > README.md
git add README.md
git commit -m "Initial commit with README"

3. Create the Project Structure
Create the necessary directories for your project:

mkdir src\main\java\com\library\management
mkdir src\test\java\com\library\management

4. Create files for project
   create the necessary files for your project:

   Book.java and Library java in mkdir src\main\java\com\library\management directories
   LibraryTest.java in mkdir src\test\java\com\library\management directores
