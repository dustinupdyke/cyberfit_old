package cyberfit.relogo

class Vuln {
	def id = -1
	def name = ""
	def machineTypes = [] //applicable machines susceptible to this attack router|server|user
}

class Vulns {
	def Items = []
	Vulns() {
		//load global vulns
		def v = new Vuln()
		v.id = 1
		v.name = "Phishing"
		v.machineTypes = ["user"] //applicable machines susceptible to this attack router|server|user
		this.Items << v
		
		v = new Vuln()
		v.id = 2
		v.name = "DDoS"
		v.machineTypes = ["server", "router"]
		this.Items << v
		
		v = new Vuln()
		v.id = 3
		v.name = "Meterpreter"
		v.machineTypes = ["server", "user"]
		this.Items << v
		
		v = new Vuln()
		v.id = 4
		v.name = "Responder"
		v.machineTypes = ["server", "user"]
		this.Items << v
	}
}
