def call(Map config = [:]) {
    sh "echo Olá ${config.name}. Hoje é ${config.dayOfWeek}."
}
