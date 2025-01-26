class LogTicket {
    private var tickets : Array<MovieTicket> = arrayOf()

    fun addTicket(ticket: MovieTicket) : Boolean{
        var result = false
        if (!tickets.contains(ticket)){
            tickets += ticket
            result = true
        }
        return result
    }

    fun getTickets() : Array<MovieTicket> {
        return tickets
    }

    override fun toString(): String {
        var result = ""
        for (ticket in tickets)
            result += ticket.toString().replace("MovieTicket(","").replace(")","") + "\n"
        return result
    }
}