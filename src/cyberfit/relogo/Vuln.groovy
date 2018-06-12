package cyberfit.relogo

class Vuln {
	def id = -1
	def name = ""
	def terrainTypes = [] //applicable machines susceptible to this attack router|server|user
}

class Vulns {
	def Items = []
	Vulns() {
		//load global vulns
		def v = new Vuln()
		v.id = 1
		v.name = "Phishing"
		v.terrainTypes = [3] //applicable machines susceptible to this attack router|server|user
		this.Items << v
		
		v = new Vuln()
		v.id = 2
		v.name = "DDoS"
		v.terrainTypes = [1,2]
		this.Items << v
		
		v = new Vuln()
		v.id = 3
		v.name = "Meterpreter"
		v.terrainTypes = [2,3]
		this.Items << v
		
		v = new Vuln()
		v.id = 4
		v.name = "Responder"
		v.terrainTypes = [2,3]
		this.Items << v
		
		v = new Vuln()
		v.id = 5
		v.name = "Credential Reuse"
		v.terrainTypes = [2,3]
		this.Items << v
		
		v = new Vuln()
		v.id = 6
		v.name = "Session Hijacking"
		v.machineTypes = [1,2,3]
		this.Items << v
		
		v = new Vuln()
		v.id = 7
		v.name = "Cross-Site Scripting"
		v.machineTypes = [2]
		this.Items << v
		
		v = new Vuln()
		v.id = 8
		v.name = "SQL Injection"
		v.machineTypes = [2]
		this.Items << v
		
		v = new Vuln()
		v.id = 9
		v.name = "Custom Malware"
		v.machineTypes = [1,2,3]
		this.Items << v
		
		v = new Vuln()
		v.id = 10
		v.name = "Advanced Persistent Threat"
		v.machineTypes = [1,2,3]
		this.Items << v
		
		v = new Vuln()
		v.id = 11
		v.name = "Ransomware"
		v.machineTypes = [3]
		this.Items << v
		
		v = new Vuln()
		v.id = 12
		v.name = "Exfiltration"
		v.machineTypes = [2]
		this.Items << v
	}
}
