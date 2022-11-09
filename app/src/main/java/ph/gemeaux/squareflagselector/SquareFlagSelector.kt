package ph.gemeaux.squareflagselector

import java.util.*

open class SquareFlagSelector {

    fun getFlagDrawable(countryCode: String?): Int {
        return when (countryCode?.uppercase()) {
            "AF" -> R.drawable.af
            "AL" -> R.drawable.al
            "DZ" -> R.drawable.dz
            "AS" -> R.drawable.ic_as
            "AD" -> R.drawable.ad
            "AO" -> R.drawable.ao
            "AI" -> R.drawable.ai
            "AQ" -> R.drawable.aq
            "AG" -> R.drawable.ag
            "AR" -> R.drawable.ar
            "AM" -> R.drawable.am
            "AW" -> R.drawable.aw
            "AU" -> R.drawable.au
            "AT" -> R.drawable.at
            "AZ" -> R.drawable.az
            "BS" -> R.drawable.bs
            "BH" -> R.drawable.bh
            "BD" -> R.drawable.bd
            "BB" -> R.drawable.bb
            "BY" -> R.drawable.by
            "BE" -> R.drawable.be
            "BZ" -> R.drawable.bz
            "BJ" -> R.drawable.bj
            "BM" -> R.drawable.bm
            "BT" -> R.drawable.bt
            "BO" -> R.drawable.bo
            "BA" -> R.drawable.ba
            "BW" -> R.drawable.bw
            "BV" -> R.drawable.bv
            "BR" -> R.drawable.br
            "IO" -> R.drawable.io
            "BN" -> R.drawable.bn
            "BG" -> R.drawable.bg
            "BF" -> R.drawable.bf
            "BI" -> R.drawable.bi
            "KH" -> R.drawable.kh
            "CM" -> R.drawable.cm
            "CA" -> R.drawable.ca
            "CV" -> R.drawable.cv
            "KY" -> R.drawable.ky
            "CF" -> R.drawable.cf
            "TD" -> R.drawable.td
            "CL" -> R.drawable.cl
            "CN" -> R.drawable.cn
            "CX" -> R.drawable.cx
            "CC" -> R.drawable.cc
            "CO" -> R.drawable.co
            "KM" -> R.drawable.km
            "CG" -> R.drawable.cg
            "CD" -> R.drawable.cd
            "CK" -> R.drawable.ck
            "CR" -> R.drawable.cr
            "CI" -> R.drawable.ci
            "HR" -> R.drawable.hr
            "CU" -> R.drawable.cu
            "CY" -> R.drawable.cy
            "CZ" -> R.drawable.cz
            "DK" -> R.drawable.dk
            "DJ" -> R.drawable.dj
            "DM" -> R.drawable.dm
            "DO" -> R.drawable.ic_do
            "TL" -> R.drawable.tl
            "EC" -> R.drawable.ec
            "EG" -> R.drawable.eg
            "SV" -> R.drawable.sv
            "GQ" -> R.drawable.gq
            "ER" -> R.drawable.er
            "EE" -> R.drawable.ee
            "ET" -> R.drawable.et
            "FK" -> R.drawable.fk
            "FO" -> R.drawable.fo
            "FJ" -> R.drawable.fj
            "FI" -> R.drawable.fi
            "FR" -> R.drawable.fr
            "GF" -> R.drawable.gf
            "PF" -> R.drawable.pf
            "TF" -> R.drawable.tf
            "GA" -> R.drawable.ga
            "GM" -> R.drawable.gm
            "GE" -> R.drawable.ge
            "DE" -> R.drawable.de
            "GH" -> R.drawable.gh
            "GI" -> R.drawable.gi
            "GB" -> R.drawable.gb
            "GR" -> R.drawable.gr
            "GL" -> R.drawable.gl
            "GD" -> R.drawable.gd
            "GP" -> R.drawable.gp
            "GU" -> R.drawable.gu
            "GT" -> R.drawable.gt
            "GN" -> R.drawable.gn
            "GW" -> R.drawable.gw
            "GY" -> R.drawable.gy
            "HT" -> R.drawable.ht
            "HM" -> R.drawable.hm
            "VA" -> R.drawable.va
            "HN" -> R.drawable.hn
            "HK" -> R.drawable.hk
            "HU" -> R.drawable.hu
            "IS" -> R.drawable.ic_is
            "IN" -> R.drawable.ic_in
            "ID" -> R.drawable.id
            "IR" -> R.drawable.ir
            "IQ" -> R.drawable.iq
            "IE" -> R.drawable.ie
            "IL" -> R.drawable.il
            "IT" -> R.drawable.it
            "JM" -> R.drawable.jm
            "JP" -> R.drawable.jp
            "JO" -> R.drawable.jo
            "KZ" -> R.drawable.kz
            "KE" -> R.drawable.ke
            "KI" -> R.drawable.ki
            "KP" -> R.drawable.kp
            "KR" -> R.drawable.kr
            "KW" -> R.drawable.kw
            "KG" -> R.drawable.kg
            "LA" -> R.drawable.la
            "LV" -> R.drawable.lv
            "LB" -> R.drawable.lb
            "LS" -> R.drawable.ls
            "LR" -> R.drawable.lr
            "LY" -> R.drawable.ly
            "LI" -> R.drawable.li
            "LT" -> R.drawable.lt
            "LU" -> R.drawable.lu
            "MO" -> R.drawable.mo
            "MK" -> R.drawable.mk
            "MG" -> R.drawable.mg
            "MW" -> R.drawable.mw
            "MY" -> R.drawable.my
            "MV" -> R.drawable.mv
            "ML" -> R.drawable.ml
            "MT" -> R.drawable.mt
            "MH" -> R.drawable.mh
            "MQ" -> R.drawable.mq
            "MR" -> R.drawable.mr
            "MU" -> R.drawable.mu
            "YT" -> R.drawable.yt
            "MX" -> R.drawable.mx
            "FM" -> R.drawable.fm
            "MD" -> R.drawable.md
            "MC" -> R.drawable.mc
            "MN" -> R.drawable.mn
            "MS" -> R.drawable.ms
            "MA" -> R.drawable.ma
            "MZ" -> R.drawable.mz
            "MM" -> R.drawable.mm
            "NA" -> R.drawable.na
            "NR" -> R.drawable.nr
            "NP" -> R.drawable.np
            "NL" -> R.drawable.nl
            "NC" -> R.drawable.nc
            "NZ" -> R.drawable.nz
            "NI" -> R.drawable.ni
            "NE" -> R.drawable.ne
            "NG" -> R.drawable.ng
            "NU" -> R.drawable.nu
            "NF" -> R.drawable.nf
            "MP" -> R.drawable.mp
            "NO" -> R.drawable.no
            "OM" -> R.drawable.om
            "PK" -> R.drawable.pk
            "PW" -> R.drawable.pw
            "PS" -> R.drawable.ps
            "PA" -> R.drawable.pa
            "PG" -> R.drawable.pg
            "PY" -> R.drawable.py
            "PE" -> R.drawable.pe
            "PH" -> R.drawable.ph
            "PN" -> R.drawable.pn
            "PL" -> R.drawable.pl
            "PT" -> R.drawable.pt
            "PR" -> R.drawable.pr
            "QA" -> R.drawable.qa
            "RE" -> R.drawable.re
            "RO" -> R.drawable.ro
            "RU" -> R.drawable.ru
            "RW" -> R.drawable.rw
            "SH" -> R.drawable.sh
            "KN" -> R.drawable.kn
            "LC" -> R.drawable.lc
            "PM" -> R.drawable.pm
            "VC" -> R.drawable.vc
            "WS" -> R.drawable.ws
            "SM" -> R.drawable.sm
            "ST" -> R.drawable.st
            "SA" -> R.drawable.sa
            "SN" -> R.drawable.sn
            "SC" -> R.drawable.sc
            "SL" -> R.drawable.sl
            "SG" -> R.drawable.sg
            "SK" -> R.drawable.sk
            "SI" -> R.drawable.si
            "SB" -> R.drawable.sb
            "SO" -> R.drawable.so
            "ZA" -> R.drawable.za
            "GS" -> R.drawable.gs
            "ES" -> R.drawable.es
            "LK" -> R.drawable.lk
            "SD" -> R.drawable.sd
            "SR" -> R.drawable.sr
            "SJ" -> R.drawable.sj
            "SZ" -> R.drawable.sz
            "SE" -> R.drawable.se
            "CH" -> R.drawable.ch
            "SY" -> R.drawable.sy
            "TW" -> R.drawable.tw
            "TJ" -> R.drawable.tj
            "TZ" -> R.drawable.tz
            "TH" -> R.drawable.th
            "TG" -> R.drawable.tg
            "TK" -> R.drawable.tk
            "TO" -> R.drawable.to
            "TT" -> R.drawable.tt
            "TN" -> R.drawable.tn
            "TR" -> R.drawable.tr
            "TM" -> R.drawable.tm
            "TC" -> R.drawable.tc
            "TV" -> R.drawable.tv
            "UG" -> R.drawable.ug
            "UA" -> R.drawable.ua
            "AE" -> R.drawable.ae
            "US" -> R.drawable.us
            "UM" -> R.drawable.um
            "UY" -> R.drawable.uy
            "UZ" -> R.drawable.uz
            "VU" -> R.drawable.vu
            "VE" -> R.drawable.ve
            "VN" -> R.drawable.vn
            "VI" -> R.drawable.vi
            "WF" -> R.drawable.wf
            "EH" -> R.drawable.eh
            "YE" -> R.drawable.ye
            "ZM" -> R.drawable.zm
            "ZW" -> R.drawable.zw
            else -> R.drawable.ic_map
        }
    }

    fun getCountryCode(countryName: String?) =
        Locale.getISOCountries().find { Locale("", it).displayCountry == countryName }
}
