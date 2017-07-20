package org.abimon.eternalJukebox.objects

data class JukeboxTrack(
        val info: JukeboxInfo,
        val analysis: JukeboxAnalysis,
        val audio_summary: JukeboxSummary
)

data class JukeboxInfo(
        val id: String,
        val idService: String,
        val name: String,
        val title: String,
        val artist: String,
        val url: String
)

data class JukeboxAnalysis(
        val sections: Array<SpotifyAudioSection>,
        val bars: Array<SpotifyAudioBar>,
        val beats: Array<SpotifyAudioBeat>,
        val tatums: Array<SpotifyAudioTatum>,
        val segments: Array<SpotifyAudioSegment>
)

data class JukeboxSummary(
        val duration: Double
)