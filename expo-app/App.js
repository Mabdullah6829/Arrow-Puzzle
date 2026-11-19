import { StatusBar } from 'expo-status-bar';
import { StyleSheet, View, Text } from 'react-native';
import { WebView } from 'react-native-webview';
import Constants from 'expo-constants';

// The game is served by serve-game.js on the same machine that runs `expo start`.
// Expo tells us that machine's address, so no IP needs to be hard-coded.
const GAME_PORT = 8080;

function gameUrl() {
  const hostUri = Constants.expoConfig?.hostUri || Constants.expoGoConfig?.debuggerHost;
  const host = hostUri ? hostUri.split(':')[0] : null;
  return host ? `http://${host}:${GAME_PORT}/info/file.html` : null;
}

export default function App() {
  const uri = gameUrl();
  return (
    <View style={styles.container}>
      <StatusBar hidden />
      {uri ? (
        <WebView
          source={{ uri }}
          style={styles.web}
          javaScriptEnabled
          domStorageEnabled
          mediaPlaybackRequiresUserAction={false}
          allowsInlineMediaPlayback
          bounces={false}
          overScrollMode="never"
          setSupportMultipleWindows={false}
        />
      ) : (
        <Text style={styles.msg}>Could not work out the game server address. Start with `npm run game`.</Text>
      )}
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: '#0b1430' },
  web: { flex: 1, backgroundColor: '#0b1430' },
  msg: { color: '#fff', margin: 40, marginTop: 120 },
});
