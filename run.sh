#!/usr/bin/env bash
export JAVA_PROGRAM_ARGS=`echo "$@"`
mvn exec:java -Dexec.mainClass="Calendar" -Dexec.args="$JAVA_PROGRAM_ARGS"