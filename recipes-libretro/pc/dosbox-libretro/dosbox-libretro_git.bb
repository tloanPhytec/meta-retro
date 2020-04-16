DESCRIPTION = "Dosbox port to libretro"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit libretro/core/git

LIBRETRO_LTO_ENABLED = "0"

LIBRETRO_CORE = "dosbox"
LIBRETRO_GIT_REPO = "github.com/libretro/dosbox-libretro.git"
