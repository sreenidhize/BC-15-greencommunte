#!/usr/bin/env python

import requests,json,sys

ZOHO_TOKEN = os.environ['ZOHO_TOKEN']
sentby="Srinidhi"
subject= "bug report"
message= 'Current Quality Status is A , "https://sonarcloud.io/dashboard?id=sreenidhize_BC-15-greencommunte&branch=master" '

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
