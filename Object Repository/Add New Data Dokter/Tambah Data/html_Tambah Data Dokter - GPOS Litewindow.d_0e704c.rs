<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_Tambah Data Dokter - GPOS Litewindow.d_0e704c</name>
   <tag></tag>
   <elementGuidId>c299beda-b111-4cc8-8548-40e5f06ee552</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value></value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//html</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>html</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>dir</name>
      <type>Main</type>
      <value>ltr</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>lang</name>
      <type>Main</type>
      <value>id</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>Tambah Data Dokter - GPOS Lite
					window.dataLayer = window.dataLayer || [];
					function gtag(){dataLayer.push(arguments);}
					gtag('js', new Date());
					gtag('config', 'UA-166650280-1');
					(function(w,d,s,l,i){
						w[l]=w[l]||[];w[l].push({'gtm.start': new Date().getTime(),event:'gtm.js'});var f=d.getElementsByTagName(s)[0], j=d.createElement(s),dl=l!='dataLayer'?'&amp;l='+l:'';j.async=true;j.src='//www.googletagmanager.com/gtm.js?id='+i+dl;f.parentNode.insertBefore(j,f);
					})(window,document,'script','dataLayer','GTM-WBW9BFH');
							var OneSignal = window.OneSignal || [];
							
							if (OneSignal.installServiceWorker) {
								OneSignal.installServiceWorker();
							} else {
								if (navigator.serviceWorker) {
									navigator.serviceWorker.register(&quot;https://devmini.gpos-efarmasi.com/OneSignalSDKWorker.js?appId=8dda1c51-1b2f-46db-864c-785241be4fe5&quot;).then(function (registration) {
										// console.log(registration);
									});
								}
							}
							
							OneSignal.push(function() {
								OneSignal.init({
									appId: &quot;8dda1c51-1b2f-46db-864c-785241be4fe5&quot;,
									allowLocalhostAsSecureOrigin: true,
									autoResubscribe: true,
									notifyButton: {
										enable: true,
									},
								});
								
								OneSignal.push([&quot;getNotificationPermission&quot;, function(permission) {
									// console.log(&quot;Site Notification Permission:&quot;, permission);
									OneSignal.showNativePrompt();
									OneSignal.setSubscription(true);
								}]);
								
								OneSignal.sendTags({
									email: 'gl22179@gpos-efarmasi.com',
								}).then(function(tagsSent) {
									// console.log(&quot;tagsSent: &quot;, tagsSent);
								});
								
								OneSignal.on('subscriptionChange', function (isSubscribed) {
									if (isSubscribed) {
										// console.log(isSubscribed);
										OneSignal.getUserId(function(playerId) {
											// console.log(&quot;OneSignal Player ID:&quot;, playerId);
										});
									} else {
										// console.log('isSubscribed: false');
									}
								});
								
								OneSignal.setExternalUserId(8280);
								
								OneSignal.on('notificationDisplay', function(event) {
									var src = '/static/one/vendor/notification_sound.mp3';
									var audio = new Audio(src);
									audio.play();
								});
							});#nprogress{pointer-events:none;}#nprogress .bar{background:#29D;position:fixed;z-index:1031;top:0;left:0;width:100%;height:2px;}#nprogress .peg{display:block;position:absolute;right:0px;width:100px;height:100%;box-shadow:0 0 10px #29D,0 0 5px #29D;opacity:1;-webkit-transform:rotate(3deg) translate(0px,-4px);-ms-transform:rotate(3deg) translate(0px,-4px);-webkit-transform:rotate(3deg) translate(0px,-4px);-ms-transform:rotate(3deg) translate(0px,-4px);transform:rotate(3deg) translate(0px,-4px);}#nprogress .spinner{display:&quot;block&quot;;position:fixed;z-index:1031;top:15px;right:15px;}#nprogress .spinner-icon{width:18px;height:18px;box-sizing:border-box;border:solid 2px transparent;border-top-color:#29D;border-left-color:#29D;border-radius:50%;-webkit-animation:nprogresss-spinner 400ms linear infinite;-webkit-animation:nprogress-spinner 400ms linear infinite;animation:nprogress-spinner 400ms linear infinite;}.nprogress-custom-parent{overflow:hidden;position:relative;}.nprogress-custom-parent #nprogress .spinner,.nprogress-custom-parent #nprogress .bar{position:absolute;}@-webkit-keyframes nprogress-spinner{0%{-webkit-transform:rotate(0deg);}100%{-webkit-transform:rotate(360deg);}}@-webkit-keyframes nprogress-spinner{0%{-webkit-transform:rotate(0deg);-ms-transform:rotate(0deg);transform:rotate(0deg);}100%{-webkit-transform:rotate(360deg);-ms-transform:rotate(360deg);transform:rotate(360deg);}}@keyframes nprogress-spinner{0%{-webkit-transform:rotate(0deg);-ms-transform:rotate(0deg);transform:rotate(0deg);}100%{-webkit-transform:rotate(360deg);-ms-transform:rotate(360deg);transform:rotate(360deg);}}#katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} div#katalon-spy_elementInfoDiv {color: lightblue; padding: 0px 5px 5px} div#katalon-spy_instructionDiv {padding: 5px 5px 2.5px} KembaliTambah Data DokterKodeNamaSpesialisasiKeteranganLokasiGL22179 - Kantor PusatInternalPilih InternalYaTidakUsernameAlamat Praktekalamat praktekAlamat Rumahalamat rumahTeleponTelepon Lainnyawindow.insider_object={user:{gdpr_optin:!0,email:&quot;jdoe@mailservice.com&quot;,email_optin:!0,list_id:[1]}};
!function(b,e,f,g,a,c,d){b.fbq||(a=b.fbq=function(){a.callMethod?a.callMethod.apply(a,arguments):a.queue.push(arguments)},b._fbq||(b._fbq=a),a.push=a,a.loaded=!0,a.version=&quot;2.0&quot;,a.queue=[],c=e.createElement(f),c.async=!0,c.src=g,d=e.getElementsByTagName(f)[0],d.parentNode.insertBefore(c,d))}(window,document,&quot;script&quot;,&quot;https://connect.facebook.net/en_US/fbevents.js&quot;);fbq(&quot;init&quot;,&quot;719097179696037&quot;);fbq(&quot;set&quot;,&quot;agent&quot;,&quot;tmgoogletagmanager&quot;,&quot;719097179696037&quot;);fbq(&quot;track&quot;,&quot;PageView&quot;);
&lt;img height=&quot;1&quot; width=&quot;1&quot; style=&quot;display:none&quot; src=&quot;https://www.facebook.com/tr?id=719097179696037&amp;amp;ev=PageView&amp;amp;noscript=1&quot;>
{&quot;props&quot;:{&quot;pageProps&quot;:{}},&quot;page&quot;:&quot;/module/doctor/create-iframe&quot;,&quot;query&quot;:{},&quot;buildId&quot;:&quot;XNNALDOWk8935WthTiUgc&quot;,&quot;nextExport&quot;:true,&quot;autoExport&quot;:true,&quot;isFallback&quot;:false}/html[@class=&quot;&quot;]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;&quot;]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>ref_element</name>
      <type>Main</type>
      <value>Object Repository/Add New Data Dokter/Tambah Data/iframe_PT. Anugrah Argon Medica_venoframe v_d25e89</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//html</value>
   </webElementXpaths>
</WebElementEntity>
