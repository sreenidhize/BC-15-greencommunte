#!/usr/bin/env python

import requests,json,sys

token="1000.8420407e3cbb754b4e2bd85975d23f8b.fa8ee35237ba7d5b4c28792e78fdb4d3"
sentby="Srinidhi"
subject= "bug report"
message= 'Current Quality Status is C , "https://sonarcloud.io/dashboard?id=sreenidhize_BC-15-greencommunte&branch=master" '

urldest= 'https://cliq.zoho.com/api/v2/channelsbyname/devopsoneononechannel/message'

headers = {
        "Content-type": "application/json",
        "Authorization": "Zoho-oauthtoken " + (token)
        }

content = {
		"text": (message),
		"broadcast" :"true",
		"bot": {
			"name": (sentby)
			},
		"card": {
			"title": (subject),
			"theme": "modern-inline"
			}
		}


post = requests.post(url=urldest, data=json.dumps(content), headers=headers)
