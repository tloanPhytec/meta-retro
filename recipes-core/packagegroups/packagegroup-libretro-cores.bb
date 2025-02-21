DESCRIPTION = "Libretro cores package group"

inherit retro-packagegroup

LIBRETRO_TARGET_PLATFORMS ?= " \
    arcade \
    atari \
    dreamcast \
    extra \
    gba \
    gbc \
    n64 \
    nds \
    nes \
    pc \
    pc98 \
    ps2 \
    saturn \
    sms \
    snes \
"

PACKAGECONFIG ?= "${LIBRETRO_TARGET_PLATFORMS}"

PACKAGECONFIG[arcade] = ",,,,packagegroup-libretro-arcade"
PACKAGECONFIG[atari] = ",,,,packagegroup-libretro-atari"
PACKAGECONFIG[dreamcast] = ",,,,packagegroup-libretro-dreamcast"
PACKAGECONFIG[extra] = ",,,,packagegroup-libretro-extra"
PACKAGECONFIG[gba] = ",,,,packagegroup-libretro-gba"
PACKAGECONFIG[gbc] = ",,,,packagegroup-libretro-gbc"
PACKAGECONFIG[n64] = ",,,,packagegroup-libretro-n64"
PACKAGECONFIG[nds] = ",,,,packagegroup-libretro-nds"
PACKAGECONFIG[nes] = ",,,,packagegroup-libretro-nes"
PACKAGECONFIG[ngc] = ",,,,packagegroup-libretro-ngc"
PACKAGECONFIG[pc98] = ",,,,packagegroup-libretro-pc98"
PACKAGECONFIG[pc] = ",,,,packagegroup-libretro-pc"
PACKAGECONFIG[ps2] = ",,,,packagegroup-libretro-ps2"
PACKAGECONFIG[saturn] = ",,,,packagegroup-libretro-saturn"
PACKAGECONFIG[sms] = ",,,,packagegroup-libretro-sms"
PACKAGECONFIG[snes] = ",,,,packagegroup-libretro-snes"
PACKAGECONFIG[wii] = ",,,,packagegroup-libretro-wii"

LIBRETRO_CORE_PACKAGES ?= " \
  81-libretro \
  beetle-ngp-libretro \
  beetle-pce-fast-libretro \
  beetle-pcfx-libretro \
  beetle-supergrafx-libretro \
  beetle-vb-libretro \
  beetle-wswan-libretro \
  caprice32-libretro \
  freechaf-libretro \
  freeintv-libretro \
  fuse-libretro \
  genesis-plus-gx-libretro \
  genesis-plus-gx-wide-libretro \
  gw-libretro \
  neocd-libretro \
  nxengine-libretro \
  o2em-libretro \
  oberon-libretro \
  opera-libretro \
  picodrive-libretro \
  pokemini-libretro \
  ppsspp-libretro \
  px68k-libretro \
  race-libretro \
  uzem-libretro \
  vecx-libretro \
  xmil-libretro \
"

RRECOMMENDS:${PN}:append = " ${LIBRETRO_CORE_PACKAGES}"
