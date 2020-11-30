val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

println(decorations.filter { true })
println(decorations.filter { it[0] == 'p' })
println(decorations.filter { it.startsWith('p') })
println(decorations.asSequence().filter { it.contains('p') }.toList())

val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
println(spices.filter { it.contains("curry") }.sortedBy { it.length })
println(spices.filter { it.startsWith('c') && it.endsWith('e') })
println(spices.filter { it.matches(Regex("^c.*e$")) })
println(spices.take(3).filter { it.startsWith('c') })
