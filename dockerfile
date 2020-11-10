version : '3.7'

services:

  hub:
    image: selenium/hub:latest
    ports:
        - 4444:4444

  chrome:
    image: selenium/node-chrome:latest
    depends_on:
        - hub
