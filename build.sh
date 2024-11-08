#!/bin/bash
sh ./gradlew clean bootJar
docker build --platform linux/amd64 -f Dockerfile -t lsh.ai/mimic-ai:latest .
docker save lsh.ai/mimic-ai:${M8_AGENT_VERSION} > build/libs/mimic-ai.tar