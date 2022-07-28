#!/bin/bash
record=$(curl -s $auth "https://sonarcloud.io/api/measures/component_tree?component=sreenidhize_BC-15-greencommunte&metricKeys=reliability_rating&ps=100&p=1")
value=$(echo $record | jq -r '.baseComponent.measures[0].value')
echo $value
A="1.0"
B="2.0"
C="3.0"
D="4.0"
if [[ "$value" = "$A" ]];
then 
  python3 /home/sring/sonar/cliq1.py
elif [[ "$value" = "$B" ]];
then 
  python3 /home/sring/sonar/cliq2.py
elif [[ "$value" = "$C" ]];
then 
  python3 /home/sring/sonar/cliq3.py
elif [[ "$value" = "$D" ]];
then 
  python3 /home/sring/sonar/cliq4.py
else 
  python3 /home/sring/sonar/cliq5.py
fi  
