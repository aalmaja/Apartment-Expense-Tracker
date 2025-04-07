#  Traefik + Let’s Encrypt + Docker Compose

Set up Traefik as a reverse proxy with automatic HTTPS (via Let's Encrypt) and a password-protected dashboard using Docker Compose.

--

## Requirements

- Git
- Docker
- Docker Compose

## Configure Environment

- Switch to the workdir(traefik-reverse-proxy):
- Create a .env file with the following content:

`DOMAIN=localhost
EMAIL=admin@localhost
CERT_RESOLVER=
TRAEFIK_USER=admin
TRAEFIK_PASSWORD_HASH=$2y$10$zi5n43jq9S63gBqSJwHTH.nCai2vB0SW/ABPGg2jSGmJBVRo0A.ni`

## Generate a new Password Hash

- I used htpasswd: htpasswd -nBC 10 your-username

## Launch and Test

- sudo docker-compose up -d
- curl --insecure https://localhost/


