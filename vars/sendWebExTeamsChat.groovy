#!/usr/bin/env groovy

import static groovy.json.JsonOutput.toJson

void call(final String message, final String url = env.WEBEX_CHAT_URL) {
    final String requestBody = toJson([markdown: message])
    echo requestBody
    httpRequest(requestBody: requestBody, url: url, httpMode: 'POST', contentType: 'APPLICATION_JSON_UTF8')
}
