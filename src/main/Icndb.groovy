import groovy.json.*

String base = 'http://api.icndb.com/jokes/random?'
def qs = [limitTo: '[nerdy]', firstName: 'John',
          lastName: 'Smith'].collect { k,v -> "$k=$v"}.join('&')

String jsonText = "$base$qs".toURL().text
def json = new JsonSlurper().parseText(jsonText)

println json.value.joke

//println qs