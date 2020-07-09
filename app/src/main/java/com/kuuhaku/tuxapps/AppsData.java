package com.kuuhaku.tuxapps;

import java.util.ArrayList;

class AppsData
{
    private static String[] namaAplikasi =
    {
        "Riot.im",
        "Kitty",
        "GIMP",
        "VeraCrypt",
        "Anchor",
        "Sourcetrail",
        "Term-clock",
        "Openshot",
        "Ksnip",
        "FF Password Exporter "
    };

    private static String[] deskripsiAplikasi =
    {
        "Riot (formerly known as Vector) is a Matrix web client built using the Matrix React SDK.\n" +
            "Riot is officially supported on the web in modern versions of Chrome, Firefox, and Safari. " +
            "Other browsers may work, however official support is not provided. For accessing Riot on an " +
            "Android or iOS device, check out riot-android and riot-ios - riot-web does not support mobile devices. \n",
        "A cross-platform, fast, feature full, GPU based terminal emulator.",
        "GIMP is a cross-platform image editor available for GNU/Linux, OS X, Windows and more operating systems. It is free software, " +
            "you can change its source code and distribute your changes. Whether you are a graphic designer, photographer, illustrator, " +
            "or scientist, GIMP provides you with sophisticated tools to get your job done. You can further enhance your productivity with GIMP " +
            "thanks to many customization options and 3rd party plugins.",
        "VeraCrypt is a source-available freeware utility used for on-the-fly encryption (OTFE).[5] It can create a virtual encrypted disk within a file " +
            "or encrypt a partition[6] or (in Windows) the entire storage device with pre-boot authentication.[7] \n" +
            "VeraCrypt is a fork of the discontinued TrueCrypt project.[8] It was initially released on 22 June 2013 and " +
            "produced its latest release (version 1.24) on 6 October 2019.[9] Many security improvements have been implemented and " +
            "issues raised by TrueCrypt code audits have been fixed. VeraCrypt includes optimized implementations of cryptographic hash " +
            "functions and ciphers which boost performance on modern CPUs. ",
        "Anchor is an open source, multi-account, multi-chain, EOSIO wallet offering secure key storage and many of the tools you’ll need in your day-to-day " +
            "usage of these platforms. It also offers authenticator features that allow you to use Anchor to sign in and interact with compatible " +
            "EOSIO applications and dapps.",
        "Software developers spend most of their time figuring out existing source code, but common code editing tools offer little help for this task. " +
            "Debuggers only allow detailed inspection of one narrow code path. 'Find all references' helps you in navigating between files, but doesn't provide the " +
            "context to see the big picture of all relevant dependencies. Sourcetrail provides both overview and details by combining an interactive dependency graph, " +
            "a concise code view and efficient code search, all built into an easy-to-use cross-platform developer tool. It supports you in exploring legacy code, " +
            "understanding the implementation and refactoring the software architecture, making it a fun experience for the whole family!.",
        "A configurable terminal clock for your GNU/Linux system...\n" +
            "\n" +
            "Installation is easy on any Linux system. For debian systems, you can install the debian package from here.\n" +
            "For any other Linux distribution, you can run the installer, found here: https://github.com/Souravgoswami/term-clock-root",
        "OpenShot is a free and open-source video editor for FreeBSD, Linux, Haiku, macOS, and Windows. The project was started in August 2008 by Jonathan Thomas, " +
            "with the objective of providing a stable, free, and friendly to use video editor. OpenShot easy to use, quick to learn, and surprisingly powerful video editor.",
        "Ksnip is a Qt based cross-platform screenshot tool that provides many annotation features for your screenshots.\n" +
            "Changed: Add missing plugs to silence snap socket warnings. (#313)\n" +
            "Fixed: Window decoration and alt+tab menu show Wayland generic icon on KDE Plasma. (#269)\n" +
            "Fixed: Logout canceled by 'ksnip' under KDE. (#281)\n" +
            "Fixed: Ksnip not displayed on the monitor (off screen). (#307)\n" +
            "Fixed: CTRL+Q to quit Ksnip not working. (#308)\n" +
            "Fixed: Global Hotkeys not working with activated Num and Caps Lock under X11. (#310)",
        "It can be difficult to export your passwords from Firefox. Since version 57 of Firefox (Quantum) existing password export addons no longer work. " +
                "Mozilla provides no other official alternatives. FF Password Exporter makes it quick and easy to export all of your passwords from Firefox. " +
                "You can use FF Password Exporter on Windows, macOS, and Linux distributions."
    };

    private static String[] versiAplikasi =
    {
        "1.3.2",
        "0.14.3",
        "2.10.14",
        "1.19.10",
        "1.0.0",
        "2020.1.131",
        "0.50",
        "2.4.4",
        "1.6.2",
        "1.1.1"
    };

    private static String[] tipe_aplikasi =
    {
        "AppImage",
        "AppImage",
        "AppImage",
        "Debian (.deb)",
        "AppImage",
        "AppImage",
        "Source-Code",
        "Source-Code",
        "Debian (.deb)",
        "AppImage"
    };

    private static String[] arsitektur =
    {
        "64bit - x86",
        "64bit - x86",
        "64bit - x86",
        "64bit - x86",
        "64bit - x86",
        "64bit - x86",
        "32bit - x86\n" +
            "64bit - x86\n" +
            "armhf - 32bit\n" +
            "arm64 - 64bit\n",
        "64bit - x86",
        "32bit - x86, 64bit - x86 ",
        "64bit - x86"
    };

    private static String[] rilis =
    {
        "stable",
        "stable",
        "stable",
        "stable",
        "git",
        "git",
        "stable",
        "stable",
        "stable",
        "git"
    };

    private static String[] tgl_rilis =
    {
        "2019-10-10",
        "2019-08-31",
        "2020-01-02",
        "2019-10-27",
        "2020-04-18",
        "2020-03-30",
        "2019-08-27",
        "2019-12-29",
        "2020-05-05",
        "2020-04-05"
    };

    private static String[] ukuran =
    {
        "76.27 MB",
        "11.53 MB",
        "161.98 MB",
        "3.17 MB",
        "63.96 MB",
        "116.36 MB",
        "0.30 MB",
        "152.75 MB",
        "5.35 MB",
        "55.59 MB"
    };

    private static int[] ikon =
    {
        R.drawable.riot,
        R.drawable.kitty,
        R.drawable.gimp,
        R.drawable.veracrypt,
        R.drawable.anchor,
        R.drawable.sourcetrail,
        R.drawable.term_clock,
        R.drawable.openshot,
        R.drawable.ksnip,
        R.drawable.ff
    };

    static ArrayList<App> AmbilDataAplikasi()
    {
        ArrayList<App> isi_list = new ArrayList<>();
        for (int posisi = 0; posisi < namaAplikasi.length; posisi++)
        {
            App aplikasi = new App(); //membuat instant class

            aplikasi.setNama(namaAplikasi[posisi]);
            aplikasi.setDeskripsi(deskripsiAplikasi[posisi]);
            aplikasi.setVersi(versiAplikasi[posisi]);
            aplikasi.setTipe_paket(tipe_aplikasi[posisi]);
            aplikasi.setArsitektur(arsitektur[posisi]);
            aplikasi.setRilis(rilis[posisi]);
            aplikasi.setTgl_rilis(tgl_rilis[posisi]);
            aplikasi.setUkuran(ukuran[posisi]);
            aplikasi.setIkon(ikon[posisi]);

            isi_list.add(aplikasi);
        }
        return isi_list;
    }
}
