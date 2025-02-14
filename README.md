# Stripe Integration with Spring Boot

This project demonstrates how to integrate Stripe payment processing into a Spring Boot application. It provides endpoints to create a card token and charge a payment using the Stripe API.

## Features

- **Create Card Token**: Generate a Stripe token for a given card.
- **Charge Payment**: Charge a payment using the generated Stripe token.
- **API Documentation**: Automatically generated using SpringDoc OpenAPI.

## Technologies Used

- **Spring Boot 3.4.2**
- **Stripe Java SDK 21.12.0**
- **SpringDoc OpenAPI 2.6.0**
- **Java 21**
- **Maven**

## Setup

### Prerequisites

- Java 21
- Maven
- Stripe API Key (set as an environment variable `STRIPE_KEY`)

### Configuration

1. Clone the repository:
   ```bash
   git clone https://github.com/DKichukov/stripe-integration.git
   cd stripe-integration

### API Documentation
The API documentation is automatically generated using SpringDoc OpenAPI. You can access it at:

- Swagger UI: http://localhost:9095/api/v1/integration/swagger-ui.html
