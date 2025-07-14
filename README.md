# Clean Architecture Workshop

This repository contains an application to be refactored to use Clean
Architecture ™️ best practices.

Use it to cement your understanding of CA.

If you want me to review and leave feedback:

1. Fork the repository
2. Solve the exercise in a new branch
3. Open a MR to that branch

## The application

The application consists of a simple TODO app with 2 functionalities: adding
todos and listing todos.

## Requirements

1. A new PostgreSQL datasource should be implemented, taking into account that
   we might need to change it again in the future
2. We will need to expose the application through a CLI as well, so the core
   application logic should be kept separate from the UI code (an HTTP API
   counts as UI code)

## License
MIT
