List strings = 'this is a list of strings'.split()
println strings

// Java natural sort
Collections.sort(strings)
println strings

// Java sort by length
Collections.sort(strings, new Comparator<String>() {
    int compare(String s1, String s2) {
        s1.size() <=> s2.size()
    }
})
println strings

// Groovy natural sort
println strings.sort(false)

// Groovy length sort
println strings.sort(false, new Comparator<String>() {
    int compare(String s1, String s2) {
        s1.size() <=> s2.size()
    }
})

// Groovy reverse length sort with a closure 2-param closure
println strings.sort(false) { s1, s2 ->
    s2.size() <=> s1.size()
}

// Groovy length sort with a 1-param closure
println strings.sort(false) { it.size() }

// Groovy sort by length, then equal lengths alphabetically
println strings.sort (false) { String s1, String s2 ->
    s1.size() <=> s2.size() ?: s1 <=> s2
}