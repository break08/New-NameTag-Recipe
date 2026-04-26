plugins {
	id("fabric-loom") version "1.9-SNAPSHOT"
	id("legacy-looming") version "1.9-SNAPSHOT" // Version must be the same as fabric-loom's
}

base {
	archivesName = project.property("archives_base_name").toString()
	version = project.property("mod_version").toString()
	group = project.property("maven_group").toString()
}

repositories {

}

legacyLooming {
	// 	The generation of intermediary to use, default is 1.
	// 	legacy.yarn() will automatically point at the variant for the set intermediary generation.
	// 	However, do not forget to set the right build number of legacy yarn as they are different per variant.
	//	intermediaryVersion = 2

	// 	Whether to use Legacy Fabric intermediaries or Upstream/Official FabricMC ones.
	//	Default to true: use Legacy Fabric intermediaries.
	// 	If setting to false, don't forget to also set intermediaryVersion to generation 2.
	//	useLFIntermediary.set(false)
}

dependencies {
    minecraft "com.mojang:minecraft:1.12.2"
    mappings "net.legacyfabric:yarn:1.12.2+build.604:v2"
    modImplementation "net.fabricmc:fabric-loader:0.19.2"

    // Legacy-Fabric API
    modImplementation net.legacyfabric.legacy-fabric-api:legacy-fabric-api:1.13.3+1.12.2
}

tasks {
	processResources {
		val projectProperties = mapOf(
			"version" to project.version
		)

		inputs.properties(projectProperties)

		filteringCharset = "UTF-8"

		filesMatching("fabric.mod.json") {
			expand(projectProperties)
		}
	}

	withType<JavaCompile> {
		options.encoding = "UTF-8"
		options.release = 8
	}

	java {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8

		// If you remove this line, sources will not be generated.
		withSourcesJar()
	}

	jar {
		from("LICENSE") {
			rename { "${it}_${project.base.archivesName.get()}" }
		}
	}
}
