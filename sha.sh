#!/bin/bash


read -p "Enter the string: " input

printf "%s" "$input" | sha256sum | awk '{print $1}'