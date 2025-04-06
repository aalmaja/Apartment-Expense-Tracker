#  Apartment Expense Tracker — Backend Engineer Academy 2025 Demo

Welcome! This project was built and will be presented as part of the **Backend Engineer Academy 2025** to demonstrate modern backend deployment workflows. It features a Spring Boot application deployed on a cloud VPS using Docker, Traefik, and PostgreSQL.

---

##  Project Summary

**Apartment Expense Tracker** is a backend service designed to manage and track shared expenses in a multi-tenant apartment setup. The demo highlights real-world infrastructure practices such as:

- Cloud server provisioning
- Dockerized deployment
- Reverse proxy with TLS certificates
- PostgreSQL database integration

---

## Tech Stack

| Layer       | Tech                        |
|-------------|-----------------------------|
| Cloud VPS   | Hetzner CPX31               |
| Backend     | Spring Boot (Java)          |
| Database    | PostgreSQL                  |
| Containers  | Docker, Docker Compose      |
| Proxy + TLS | Traefik                     |

---

## Setup & Deployment

### 1.  Provision a Hetzner Cloud Server

- Rent a **CPX31** instance from Hetzner Cloud
- Recommended OS: Pick your flavour; I used Debian 12
- Set up SSH access to manage the server

### 2.  Configure Traefik (Reverse Proxy)

- Traefik handles routing and automatically provisions **HTTPS certificates via Let's Encrypt**
- Sample config and `traefik.yml` included in the `/traefik` folder
- Mounted into Docker with `docker-compose`

### 3.  Dockerize the Spring Boot App

- App containerized using a `Dockerfile`
- Environment variables managed via `.env` file
- Configured via `docker-compose.yml`

### 4. Setup PostgreSQL

- Database runs as a Docker container
- Initializes with proper users and schema
- Connection details configured via environment variables

---

## Testing & Usage

Once deployed:

- Access the API over HTTPS via your domain/subdomain
- Confirm API is operational (`/health`, `/expenses`, etc.)
- Logs available via `docker logs`

---

